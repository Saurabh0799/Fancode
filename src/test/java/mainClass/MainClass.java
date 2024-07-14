package mainClass;

import org.testng.annotations.Test;

import steps.Test002_Posts;
import steps.Test003_Comments;
import steps.Test004_Albums;
import steps.Test005_photos;
import steps.Test006_users;
import steps.Test001_TODOS;

public class MainClass {
	Test001_TODOS todo=new Test001_TODOS();
	Test002_Posts post=new Test002_Posts();
	Test003_Comments comment=new Test003_Comments();
	Test004_Albums album=new Test004_Albums();
	Test005_photos photo=new Test005_photos();
	Test006_users user=new Test006_users();
	
	@Test(priority = 1)
	public void todo()
	{
		todo.Test001Todo();
	}
	
	
	@Test(priority = 2)
	public void post()
	{
		post.Test002Post();
	}
	
	@Test(priority = 3)
	public void comment()
	{
		comment.Test002Comment();
	}
	
	@Test(priority = 4)
	public void Album()
	{
		album.Test002Album();
	}
	
	@Test(priority = 5)
	public void photos()
	{
		photo.Test002Photo();
	}

	@Test(priority = 6)
	public void user()
	{
		user.Test002User();
	}
}
