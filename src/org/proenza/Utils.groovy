package org.proenza;

def info(String message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def getEnviroment(Boolean deployToProduction) {
  return deployToProduction ? 'production' : 'staging'
}

def buildTypescript() {
    sh 'echo "Build TS"'
}

def buildJavascript() {
    sh 'echo "Build JS"'
}

def getBuildScript(Boolean isTypescript) {
    isTypescript ? buildTypescript() : buildJavascript()
}