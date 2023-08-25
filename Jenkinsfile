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
                // Email notification for a successful build
                emailext (
                    subject: "Build Success - ${currentBuild.fullDisplayName}",
                    body: "The build ${currentBuild.fullDisplayName} succeeded.",
                    recipientProviders: [
                        [$class: 'CulpritsRecipientProvider'],
                        [$class: 'DevelopersRecipientProvider'],
                        [$class: 'RequesterRecipientProvider']
                    ],
                    to: 'fakher.mekki@sesame.com.tn',
                    mimeType: 'text/plain'
                )
            }
        }
        failure {
            script {
                // Email notification for a failed build
                emailext (
                    subject: "Build Failure - ${currentBuild.fullDisplayName}",
                    body: "The build ${currentBuild.fullDisplayName} failed. See the Jenkins console output for details.",
                    recipientProviders: [
                        [$class: 'CulpritsRecipientProvider'],
                        [$class: 'DevelopersRecipientProvider'],
                        [$class: 'RequesterRecipientProvider']
                    ],
                    to: 'fakher.mekki@sesame.com.tn',
                    mimeType: 'text/plain'
                )
            }
        }
    }
}
