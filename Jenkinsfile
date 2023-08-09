pipeline {
    agent any
    stages {
        stage('build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/fakhercheva/devops-automation']])
                sh 'mvn clear install'
            }
        }
    }
}
