package likelion12th.test.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Hello {

    @Id @GeneratedValue
    private Long id;

    private String name;

    public Hello(String name) {
        this.name = name;
    }

}
