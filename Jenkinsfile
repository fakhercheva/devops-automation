pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from your version control system
                // Example: checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/fakhercheva/devops-automation.git']]])
            }
        }
        stage('Build') {
            steps {
                // Build your project here
                echo 'build start'
            }
        }
        // Add more stages as needed for your specific pipeline
    }
    post {
        success {
            script {
                // Email notification for a successful build
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
                // Email notification for a failed build
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
