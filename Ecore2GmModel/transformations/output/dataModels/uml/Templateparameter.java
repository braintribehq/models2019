/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Templateparameter of the Data Model uml.
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
{@link default_}, 
{@link ownedDefault}, 
{@link parameteredElement}, 
{@link signature}, 
{@link ownedParameteredElement}, 

* It provides of then following operations (getters and setters)
{@link getDefault_},
{@link getOwnedDefault},
{@link getParameteredElement},
{@link getSignature},
{@link getOwnedParameteredElement},
{@link setDefault_},
{@link setOwnedDefault},
{@link setParameteredElement},
{@link setSignature},
{@link setOwnedParameteredElement},
 */

@Description("A TemplateParameter exposes a ParameterableElement as a formal parameter of a template.<p>From package UML::CommonStructure.</p>")

public interface Templateparameter extends GenericEntity, uml.Element {

	EntityType<Templateparameter> T = EntityTypes.T(Templateparameter.class);

	/* Constants for each property name. */
	java.lang.String default_ = "default_";
	java.lang.String ownedDefault = "ownedDefault";
	java.lang.String parameteredElement = "parameteredElement";
	java.lang.String signature = "signature";
	java.lang.String ownedParameteredElement = "ownedParameteredElement";

	@Description("The ParameterableElement that is the default for this formal TemplateParameter.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getDefault_();
	void setDefault_(uml.Parameterableelement default_);
	@Description("The ParameterableElement that is owned by this TemplateParameter for the purpose of providing a default.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getOwnedDefault();
	void setOwnedDefault(uml.Parameterableelement ownedDefault);
	@Description("The ParameterableElement exposed by this TemplateParameter.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getParameteredElement();
	void setParameteredElement(uml.Parameterableelement parameteredElement);
	@Description("The TemplateSignature that owns this TemplateParameter.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templatesignature getSignature();
	void setSignature(uml.Templatesignature signature);
	@Description("The ParameterableElement that is owned by this TemplateParameter for the purpose of exposing it as the parameteredElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Parameterableelement getOwnedParameteredElement();
	void setOwnedParameteredElement(uml.Parameterableelement ownedParameteredElement);
}
