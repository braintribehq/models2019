/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Templatebinding of the Data Model uml.
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
{@link parameterSubstitution}, 
{@link signature}, 
{@link boundElement}, 

* It provides of then following operations (getters and setters)
{@link getParameterSubstitution},
{@link getSignature},
{@link getBoundElement},
{@link setParameterSubstitution},
{@link setSignature},
{@link setBoundElement},
 */

@Description("A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template.<p>From package UML::CommonStructure.</p>")

public interface Templatebinding extends GenericEntity, uml.Directedrelationship {

	EntityType<Templatebinding> T = EntityTypes.T(Templatebinding.class);

	/* Constants for each property name. */
	java.lang.String parameterSubstitution = "parameterSubstitution";
	java.lang.String signature = "signature";
	java.lang.String boundElement = "boundElement";

	@Description("The TemplateParameterSubstitutions owned by this TemplateBinding.<p>From package UML::CommonStructure.</p>")
	
	java.util.List<uml.Templateparametersubstitution> getParameterSubstitution();
	void setParameterSubstitution(java.util.List<uml.Templateparametersubstitution> parameterSubstitution);

	@Description("The TemplateSignature for the template that is the target of this TemplateBinding.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templatesignature getSignature();
	void setSignature(uml.Templatesignature signature);
	@Description("The TemplateableElement that is bound by this TemplateBinding.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Templateableelement getBoundElement();
	void setBoundElement(uml.Templateableelement boundElement);
}
