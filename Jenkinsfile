pipeline {
    agent any 
    stages {
        stage('Checkout') { 
            steps {
                sh 'echo checkout'
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/amarredzepi/DevOpsDemo']]])
            }
        }
    stage('Test') { 
            steps {
                sh 'echo test'
            }
        }
    stage('Deploy') { 
            steps {
                sh 'echo deploy'
            }
        }
    }
}