package raylras.zen.ast.stmt;

import raylras.zen.ast.ASTNode;
import raylras.zen.ast.ASTNodeVisitor;
import raylras.zen.ast.type.Expression;
import raylras.zen.ast.type.Statement;
import raylras.zen.ast.type.TopLevel;

import java.util.ArrayList;
import java.util.List;

/**
 * while (expr) { stmt; }
 */
public class WhileStatementNode extends ASTNode implements Statement, TopLevel {

    private Expression expr;
    private List<Statement> statements;

    public WhileStatementNode() {
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
    public void addChild(ASTNode node) {
        if (node instanceof Expression) {
            if (expr == null) {
                expr = (Expression) node;
            }
        } else if (node instanceof Statement) {
            if (statements == null) {
                statements = new ArrayList<>();
            }
            statements.add((Statement) node);
        }
    }

    @Override
    public <T> T accept(ASTNodeVisitor<? extends T> visitor) {
        return visitor.visit(this);
    }

}
