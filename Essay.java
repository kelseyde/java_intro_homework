public class Essay{
  private String title;
  private Word[] words;

  public Essay(String title){
    this.title = title;
    this.words = new Word[10];
  }

  public String getTitle(){
    return this.title;
  }

  public int wordCount(){
    int count = 0;
    for(Word element: this.words){
      if (element != null) count++;
    }
    return count;
  }

  public boolean isFull(){
    return this.wordCount() == this.words.length;
  }

  public void write(Word word){
    if( this.isFull() ) return;
    int wordCount = wordCount();
    words[wordCount] = word;
  }

  public void erase(){
    for( int i = 0; i < words.length; i++){
      words[i] = null;
    }
  }



}
