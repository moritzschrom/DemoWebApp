/* see https://www.jenkins.io/doc/book/pipeline/ */

pipeline {
	agent any

	tools {
		jdk "JDK 16"   /* may need to be adapted */
		maven "Maven 3.8"   /* may need to be adapted */
	}

	stages {
	    stage("Build") {
            steps {
                sh "mvn clean package"
            }
        }

        stage("Test") {
            steps {
                sh "mvn verify"
            }
        }
	}

	post {
        always {
            junit allowEmptyResults: true, testResults: "target/surefire-reports/*.xml,target/failsafe-reports/*.xml"

            jacoco()
        }
    }
}
