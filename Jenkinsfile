pipeline {
    agent any

    stages {
        stage('SCM checkout') {
            steps {
                echo 'Hello checkout SCM'
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