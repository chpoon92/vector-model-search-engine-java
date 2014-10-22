package hk.ust.comp4321.database;

/**
 * 
 * @author Alex Poon
 */
public class DocInfo
{

  //Constants and fields.
  // -------------------------------------------------------------------------

  private int id;
  private int frequency;

  // Constructors.
  // -------------------------------------------------------------------------

  /**
   * This constrcutor encapsulates the word id and frequency in a document.
   * 
   * @param id      the word id to be inserted
   * @param frequency the associated frequency
   */
  public DocInfo(int id, int frequency)
  {
    this.id = id;
    this.frequency = frequency;
  }

  /**
   * This method returns the word id of the word instance.
   * 
   * @return the word id of the word instance 
   */
  public int getId()
  {
    return this.id;
  }

  /**
   * This method returns the frequency of the word instance.
   * 
   * @return the frequency of the word instance 
   */
  public int getFrequency()
  {
    return this.frequency;
  }
}
