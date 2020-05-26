
package br.com.caelum.estoque.modelo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoItem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Livro"/>
 *     &lt;enumeration value="Celular"/>
 *     &lt;enumeration value="Tablet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoItem")
@XmlEnum
public enum TipoItem {

    @XmlEnumValue("Livro")
    LIVRO("Livro"),
    @XmlEnumValue("Celular")
    CELULAR("Celular"),
    @XmlEnumValue("Tablet")
    TABLET("Tablet");
    
    private final String nome;

    TipoItem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static boolean existe(String valor) {
    	try {
    		TipoItem.valueOf(valor);
    		return true;
    	}
    	catch(IllegalArgumentException e) {
    		return false;
    	}
    }

}
