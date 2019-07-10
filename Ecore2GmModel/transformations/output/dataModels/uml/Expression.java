/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Expression of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link operand}, 
{@link symbol}, 

* It provides of then following operations (getters and setters)
{@link getOperand},
{@link getSymbol},
{@link setOperand},
{@link setSymbol},
 */

@Description("An Expression represents a node in an expression tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly empty sequence of operands that are ValueSpecifications. It denotes a (possibly empty) set of values when evaluated in a context.<p>From package UML::Values.</p>")

public interface Expression extends GenericEntity, uml.Valuespecification {

	EntityType<Expression> T = EntityTypes.T(Expression.class);

	/* Constants for each property name. */
	java.lang.String operand = "operand";
	java.lang.String symbol = "symbol";

	@Description("Specifies a sequence of operand ValueSpecifications.<p>From package UML::Values.</p>")
	
	java.util.List<uml.Valuespecification> getOperand();
	void setOperand(java.util.List<uml.Valuespecification> operand);

	@Description("The symbol associated with this node in the expression tree.<p>From package UML::Values.</p>")
	@Mandatory
	types.String getSymbol();
	void setSymbol(types.String symbol);
}
