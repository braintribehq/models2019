/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Constraint of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link expression}, 
{@link expressionLanguage}, 
{@link owner}, 

* It provides of then following operations (getters and setters)
{@link getExpression},
{@link getExpressionLanguage},
{@link getOwner},
{@link setExpression},
{@link setExpressionLanguage},
{@link setOwner},
 */

@Description("A rule that must be universally satisfied i.e. all conditions required for the Constraint to be applicable, are known.")

public interface Constraint extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<Constraint> T = EntityTypes.T(Constraint.class);

	/* Constants for each property name. */
	java.lang.String expression = "expression";
	java.lang.String expressionLanguage = "expressionLanguage";
	java.lang.String owner = "owner";

	@Description("The description of a Constraint in a specific language, defined in expressionLanguage")
	@Mandatory
	java.lang.String getExpression();
	void setExpression(java.lang.String expression);
	@Description("The language in which a Constraint in expressed.")
	@Mandatory
	java.lang.String getExpressionLanguage();
	void setExpressionLanguage(java.lang.String expressionLanguage);
	@Description("The owner of the Rule.")
	@Mandatory
	iso20022.RepositoryConcept getOwner();
	void setOwner(iso20022.RepositoryConcept owner);
}
