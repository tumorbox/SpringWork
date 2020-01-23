package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	private IArticleDAO articleDAO;
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}

	@Override
	public void write(ArticleDTO article) {
		System.out.println("¸Â³ª??");
		articleDAO.insert(article);
		
	}
}
