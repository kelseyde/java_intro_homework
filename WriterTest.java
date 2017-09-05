import static org.junit.Assert.assertEquals;
import org.junit.*;

public class WriterTest{
  Writer writer;
  Essay essay;
  Word word;

  @Before
  public void before(){
    writer = new Writer("Mags");
    essay = new Essay("Mags' Essay");
    word = new Word();
  }

  @Test
  public void writerWordsStartsAtZero(){
    assertEquals(0, writer.wordCount() );
  }

  @Test
  public void writerCanHaveIdeas(){
    writer.haveIdea(word);
    assertEquals(1, writer.wordCount() );
  }

  @Test
  public void writerCanWriteWordsInEssay(){
  writer.haveIdea(word);
  writer.writeInEssay(essay, word);
  assertEquals(0, writer.wordCount() );
  assertEquals(1, essay.wordCount() );
}

}
