/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Stringexpression of the Data Model uml.
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
{@link owningExpression}, 
{@link subExpression}, 

* It provides of then following operations (getters and setters)
{@link getOwningExpression},
{@link getSubExpression},
{@link setOwningExpression},
{@link setSubExpression},
 */

@Description("A StringExpression is an Expression that specifies a String value that is derived by concatenating a sequence of operands with String values or a sequence of subExpressions, some of which might be template parameters.<p>From package UML::Values.</p>")

public interface Stringexpression extends GenericEntity, uml.Expression, uml.Templateableelement {

	EntityType<Stringexpression> T = EntityTypes.T(Stringexpression.class);

	/* Constants for each property name. */
	java.lang.String owningExpression = "owningExpression";
	java.lang.String subExpression = "subExpression";

	@Description("The StringExpression of which this StringExpression is a subExpression.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Stringexpression getOwningExpression();
	void setOwningExpression(uml.Stringexpression owningExpression);
	@Description("The StringExpressions that constitute this StringExpression.<p>From package UML::Values.</p>")
	
	java.util.List<uml.Stringexpression> getSubExpression();
	void setSubExpression(java.util.List<uml.Stringexpression> subExpression);

}
