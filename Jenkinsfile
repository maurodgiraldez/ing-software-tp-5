pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/maurodgiraldez/ing-software-tp-5', branch: 'master')
        sh 'gradlew build'
        sh 'echo Build satisfactory'
        withGradle() {
          sh 'build'
        }

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