folder('ProjectA')
folder('ProjectA/A1')

job('ProjectA/A1/a1_jenkins_job') {
    description('Job for ProjectA → A1')
    steps {
        shell('echo Running a1_jenkins_job...')
    }
}
