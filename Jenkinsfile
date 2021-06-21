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
                bat "mvn clean package"
            }
        }

        stage("Test") {
            bat "mvn verify"
        }
	}
}
