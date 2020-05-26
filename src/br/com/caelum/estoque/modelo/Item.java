
package br.com.caelum.estoque.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de item complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "codigo",
    "nome",
    "quantidade",
    "tipo"
})
public class Item {

    protected String codigo;
    protected String nome;
    protected int quantidade;
    protected String tipo;

    public Item(String codigo2, String nome2, String tipo2, int quantidade2) {
    	this.codigo = codigo2;
    	this.nome = nome2;
    	this.tipo = tipo2;
    	this.quantidade = quantidade2;
    }

	public Item() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }
    
	public static class Builder {
		
		private String codigo;
		private String nome;
		private String tipo;
		private int quantidade;
		
		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder comTipo(String tipo) {
			this.tipo = tipo;
			return this;
		}
		
		public Builder comCodigo(String codigo) {
			this.codigo = codigo;
			return this;
		}
		
		public Builder comQuantidade(int quantidade) {
			this.quantidade = quantidade;
			return this;
		}
		
		public Item build() {
			return new Item(this.codigo,this.nome,this.tipo,this.quantidade);
		}
		
	}


}
