pipeline {
    agent any

    stages {
        stage('SCM checkout') {
            steps {
                echo 'Hello checkout SCM'
            }
        }
     post {
        success {
            emailext(
                subject: "Build Success - ${currentBuild.fullDisplayName}",
                body: "The build ${currentBuild.fullDisplayName} succeeded.",
                to: 'fakher.mekki@sesame.com.tn',
                cc: '',
                bcc: '',
                replyTo: '',
                mimeType: 'text/plain'
            )
        }
        failure {
            // Actions to take in case of build failure
        }
    }        

        stage('Build') {
            steps {
                echo 'Build completed'
            }
        }

        stage('Test') {
            steps {
                echo 'Test completed'
                bat "\"C:\\Program Files\\Git\\bin\\bash.exe\" -c 'date'"
            }
        }

          stage('Deploy') {
            steps {
                echo 'Deploy completed'
            }
        }
    }
}
