package part2;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="resumes")
public class ResumeList {

    public List<Resume> resume;
}
