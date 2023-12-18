def call(Map stageParams) {

checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/anilkegarla/myrepo1.git']])
    
  }