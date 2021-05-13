


import java.util.Map;


public class SpringQuestions {

	int qId;
	String question;
	Map<Integer,String> answers;
	
	
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	public void setQuestionId(int questionId) {
		this.qId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestionId() {
		return qId;
	}
	public String getQuestion() {
		return question;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void output()
	{
		System.out.println("Question ID is :"+this.getQuestionId());
		System.out.println("Question is :"+this.getQuestion());
		System.out.println("Answers are :"+this.getAnswers());
		}
		
	
	
}
