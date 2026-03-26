def call() {
    sh 'snyk code test --json | snyk-to-html -o report-code.html'
    sh 'snyk iac test terraform/ --json | snyk-to-html -o report-terraform.html'
    sh 'snyk test --all-projects --json | snyk-to-html -o report-dependencies.html'
}