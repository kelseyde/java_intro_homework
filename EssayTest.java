import static org.junit.Assert.assertEquals;
import org.junit.*;

public class EssayTest{
  Essay essay;
  Word word;

  @Before
  public void before(){
    essay = new Essay("Some Title");
    word = new Word();
  }

  @Test
  public void hasName(){
    assertEquals("Some Title", essay.getTitle());
  }

  @Test
  public void canWrite(){
    essay.write(word);
    assertEquals(1, essay.wordCount() );
  }

  @Test
  public void cannotWriteWhenFull(){
    for(int i = 0; i < 20; i++){
      essay.write(word);
    }
    assertEquals(true, essay.isFull() );
  }

  @Test
  public void isFull(){
    for(int i = 0; i < 20; i++){
      essay.write(word);
    }
    assertEquals(true, essay.isFull() );
  }

  @Test
  public void isEmptyAfterErasing(){
    essay.write(word);
    essay.erase();
    assertEquals(0, essay.wordCount() );
  }

  @Test
  public void wordsStartsEmpty(){
    assertEquals(0, essay.wordCount() );
  }

}
