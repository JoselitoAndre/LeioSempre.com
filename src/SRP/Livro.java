package SRP;

import java.io.InputStream;

import javax.imageio.stream.MemoryCacheImageInputStream;

public abstract class Livro extends MemoryCacheImageInputStream {
	
	private static InputStream stream;

	private int idLivro;

	private String nome;

	private String dataDaEdicao;
	private String autor;
	public Livro(int idLivro, String nome, String dataDaEdicao, String autor) {
		super(stream);
		this.idLivro = idLivro;
		this.nome = nome;
		this.dataDaEdicao = dataDaEdicao;
		this.autor = autor;
	}
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDaEdicao() {
		return dataDaEdicao;
	}
	public void setDataDaEdicao(String dataDaEdicao) {
		this.dataDaEdicao = dataDaEdicao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	
}
