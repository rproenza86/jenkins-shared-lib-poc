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

def getBuildScript(Boolean isTypescript) {
    isTypescript ? sh 'echo "Build TS"' : sh 'echo "Build JS"'
}