/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Opaqueexpression of the Data Model uml.
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
{@link behavior}, 
{@link body}, 
{@link language}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getBehavior},
{@link getBody},
{@link getLanguage},
{@link getResult},
{@link setBehavior},
{@link setBody},
{@link setLanguage},
{@link setResult},
 */

@Description("An OpaqueExpression is a ValueSpecification that specifies the computation of a collection of values either in terms of a UML Behavior or based on a textual statement in a language other than UML<p>From package UML::Values.</p>")

public interface Opaqueexpression extends GenericEntity, uml.Valuespecification {

	EntityType<Opaqueexpression> T = EntityTypes.T(Opaqueexpression.class);

	/* Constants for each property name. */
	java.lang.String behavior = "behavior";
	java.lang.String body = "body";
	java.lang.String language = "language";
	java.lang.String result = "result";

	@Description("Specifies the behavior of the OpaqueExpression as a UML Behavior.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Behavior getBehavior();
	void setBehavior(uml.Behavior behavior);
	@Description("A textual definition of the behavior of the OpaqueExpression, possibly in multiple languages.<p>From package UML::Values.</p>")
	
	java.util.List<types.String> getBody();
	void setBody(java.util.List<types.String> body);

	@Description("Specifies the languages used to express the textual bodies of the OpaqueExpression.  Languages are matched to body Strings by order. The interpretation of the body depends on the languages. If the languages are unspecified, they may be implicit from the expression body or the context.<p>From package UML::Values.</p>")
	
	java.util.List<types.String> getLanguage();
	void setLanguage(java.util.List<types.String> language);

	@Description("If an OpaqueExpression is specified using a UML Behavior, then this refers to the single required return Parameter of that Behavior. When the Behavior completes execution, the values on this Parameter give the result of evaluating the OpaqueExpression.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Parameter getResult();
	void setResult(uml.Parameter result);
}
