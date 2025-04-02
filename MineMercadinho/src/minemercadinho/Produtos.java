//Santinho Developer
package minemercadinho;

//55-84-99451-4190♥
public class Produtos {
  private  int cod_produto;
  private  String Descricao;
  private  int quantidade;
  private  float preco;
  private  float total;
  
  
  //contutor
  public Produtos(int cod_produto, String Descricao, int quantidade, float preco)
  { this.cod_produto = cod_produto;
    this.Descricao = Descricao;
    if (quantidade >= 0)
    {   this.quantidade = quantidade;
    }
    else
    {this.quantidade = 0;
    }
    this.preco = preco;
  }
  
  public float getTotal()
  {
    this.total = this.preco * this.quantidade;
    return this.total;
  }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
  
    
    
}//classe Produtos
