import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringParser {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Expression expression =parser.parseExpression("World");
		String strVal = expression.getValue(String.class);
		System.out.println(" Literal expression :\n" + strVal);

		expression =parser.parseExpression("'World'.concat('!')");
		strVal = expression.getValue(String.class);
		System.out.println(" Method invocation :\n" + strVal);

		expression =parser.parseExpression("16 * 5");
		Integer intVal = expression.getValue(Integer.class);
		System.out.println(" Mathematical operator:\n" + intVal);

		expression =parser.parseExpression("5 < 9");
		boolean boolVal = expression.getValue(Boolean.class);
		System.out.println(" Mathematical operator:\n" + boolVal);

		expression =parser.parseExpression("1000 > 800 && 700 < 1500");
		boolVal = expression.getValue(Boolean.class);
		System.out.println(" Logical operator :\n" + boolVal);

		expression =parser.parseExpression("'some value' != null ? 'some value' : 'default'");
		strVal = expression.getValue(String.class);
		System.out.println(" Ternary operator:\n" + strVal);

		
		expression =parser.parseExpression("'UPPERCASE STRING' matches '[A-Z\\s]+'");
		boolVal = expression.getValue(Boolean.class);
		System.out.println(" Regex/matches operator:\n" + boolVal);
	}
}