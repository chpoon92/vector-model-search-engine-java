package hk.ust.comp4321.database;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Alex Poon
 */
public class PageInfo implements Serializable
{

  // Constants and fields.
  // -------------------------------------------------------------------------

  /**
   * 
   */
  private static final long serialVersionUID = 4619106846397540995L;
  private String url;
  private String title;
  private long size;
  private Date lastModificationDate;
  private String parentLink;
  private List<String> childLinks;

  // Constructors.
  // -------------------------------------------------------------------------

  /**
   * This constrcutor encapsulates the url, the title, the size in bytes and the
   * last modification date of a page.
   * 
   * @param url                  the absolute url of the page
   * @param title                the title of the page
   * @param size                 the size of the page in byte
   * @param lastModificationDate the last modification date of the page
   * @param parentLink           the parent link of the page
   * @param childLinks           the child links of the page
   */
  public PageInfo (String url, String title, long size,
                   Date lastModificationDate, String parentLink,
                   List<String> childLinks)
  {
    this.url = url;
    this.title = title;
    this.size = size;
    this.lastModificationDate = lastModificationDate;
    this.parentLink = parentLink;
    this.childLinks = childLinks;
  }

  //Instance methods.
  // -------------------------------------------------------------------------

  /**
   * This method simply returns the absolute url of the page
   * @return the absolute url of the page
   */
  public String getUrl()
  {
    return this.url;
  }

  /**
   * This method simply returns the title of the page
   * @return the title of the page
   */
  public String getTitle()
  {
    return this.title;
  }

  /**
   * This method simply returns the size of the page
   * @return the size of the page
   */
  public long getSize()
  {
    return this.size;
  }

  /**
   * This method simply returns the last modification date of the page
   * @return the last modification date of the page
   */
  public Date getDate()
  {
    return this.lastModificationDate;
  }

  /**
   * This method simply returns the parent link of the page
   * @return the parent link of the page
   */
  public String getParentLink()
  {
    return this.parentLink;
  }

  /**
   * This method simply returns a list of the child links of the page
   * @return the list of the child links of the page
   */
  public List<String> getChildLinks()
  {
    return this.childLinks;
  }

  /**
   * This method modifies the absolute url of the page
   * @param url the new absolute url of the page
   */
  public void setUrl(String url)
  {
    this.url = url;
  }

  /**
   * This method modifies the title of the page
   * @param title the new title of the page
   */
  public void setTitle(String title)
  {
    this.title = title;
  }

  /**
   * This method modifies the size of the page
   * @param size the new size of the page
   */
  public void setSize(int size)
  {
    this.size = size;
  }

  /**
   * This method modifies the last modification date of the page
   * @param lastModificationDate the last modification date of the page
   */
  public void setDate(Date lastModificationDate)
  {
    this.lastModificationDate = lastModificationDate;
  }

  /**
   * This method modifies the parent link of the page
   * @param parentLink the parent link of the page
   */
  public void setParentLink(String parentLink)
  {
    this.parentLink = parentLink;
  }

  /**
   * This method modifies the list of the child links of the page
   * @param childLinks the list of the child links of the page
   */
  public void setChildLinks(List<String> childLinks)
  {
    this.childLinks = childLinks;
  }

  /**
   * This method checks if two page info objects are equal
   * 
   * @param obj another PageInfo object
   * @return    true if two objects are equal
   */
  public boolean equals (PageInfo obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PageInfo other = (PageInfo) obj;
    if (!this.url.equals (other.url))
      return false;
    else if (!this.title.equals (other.title))
      return false;
    else if (this.size != other.size)
      return false;
    else if (!this.lastModificationDate.equals (other.lastModificationDate))
      return false;
    return true;
  }
}