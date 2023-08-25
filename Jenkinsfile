pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                Example: checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/fakhercheva/devops-automation.git']]])
            }
        }
        stage('Build') {
            steps {
                echo 'build start'
            }
        }
    }
    post {
        success {
            script {
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
        }
        failure {
            script {
                emailext(
                    subject: "Build Failure - ${currentBuild.fullDisplayName}",
                    body: "The build ${currentBuild.fullDisplayName} failed. See the Jenkins console output for details.",
                    to: 'fakher.mekki@sesame.com.tn',
                    cc: '',
                    bcc: '',
                    replyTo: '',
                    mimeType: 'text/plain'
                )
            }
        }
    }
}
