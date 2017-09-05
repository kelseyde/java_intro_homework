public class Writer{
  String name;
  Word[] ideas;

  public Writer(String name){
    this.name = name;
    this.ideas = new Word[10];
  }

  public int wordCount(){
    int count = 0;
    for(Word element: this.ideas){
      if (element != null) count++;
    }
    return count;
  }

  public boolean isFull(){
    return this.wordCount() == this.ideas.length;
  }

  public void haveIdea(Word word){
    if ( this.isFull() ) return;
    int wordCount = wordCount();
    ideas[wordCount] = word;
  }

  public void writeInEssay(Essay essay, Word word){
    int wordCount = wordCount();
    ideas[wordCount - 1] = null;
    essay.write(word);
  }


}
