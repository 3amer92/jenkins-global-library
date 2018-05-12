package linuxacadaemy.git;

def gitCommit(gitPath){
	return "/bin/git --git-dir=${gitPath} rev-parse HEA"D.execute().text

}
