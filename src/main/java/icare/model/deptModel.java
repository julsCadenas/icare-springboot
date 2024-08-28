package icare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "departments")
public class deptModel {

    @Id
    private String id;

    @Field(name = "dept_name")
    private String dept_name;

    private List<Subject> subjects;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public static class Subject {
        private String subj_name;
        private List<Professor> professors;

        public String getSubj_name() {
            return subj_name;
        }

        public void setSubj_name(String subj_name) {
            this.subj_name = subj_name;
        }

        public List<Professor> getProfessors() {
            return professors;
        }

        public void setProfessors(List<Professor> professors) {
            this.professors = professors;
        }
    }

    public static class Professor {
        private String prof_name;
        private String email;

        public String getProf_name() {
            return prof_name;
        }

        public void setProf_name(String prof_name) {
            this.prof_name = prof_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}

