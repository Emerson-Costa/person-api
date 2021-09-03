package one.digitalinnovation.personapi.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data // Automaticamente ele irá gerar um Getter e um Setter
@Builder // Construção de Objetos

/* Insere os Diferentes tipos de construtores com ou sem parametros */
@AllArgsConstructor
@NoArgsConstructor
/*------------------------------------------------------------------*/

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Enumerated(EnumType.STRING) // Atributo de Classe Enumerator
    @Column(nullable = false) // NOT NULL
    private PhoneType type;
    @Column(nullable = false)
    private  String number;
}
