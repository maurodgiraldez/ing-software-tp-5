pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Build satisfactory'
      }
    }

    stage('Test') {
      steps {
        sh 'echo Test run satisfactory'
      }
    }

    stage('Validate') {
      steps {
        sh 'echo Validate run satisfactory'
      }
    }

    stage('Jacoco') {
      steps {
        sh './gradlew -i test jacocoTestReport'
      }
    }

    stage('SonarQube') {
      steps {
        sh 'echo SonarQube'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo Deployado maquina'
      }
    }

  }
}