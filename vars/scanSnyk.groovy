def call() {
    sh 'snyk code test --json | snyk-to-html -o report-code.html'
    sh 'snyk iac test terraform/ --json | snyk-to-html -o report-terraform.html'
}