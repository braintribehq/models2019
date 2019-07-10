/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Redefinabletemplatesignature of the Data Model uml.
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
{@link extendedSignature}, 
{@link inheritedParameter}, 
{@link classifier}, 

* It provides of then following operations (getters and setters)
{@link getExtendedSignature},
{@link getInheritedParameter},
{@link getClassifier},
{@link setExtendedSignature},
{@link setInheritedParameter},
{@link setClassifier},
 */

@Description("A RedefinableTemplateSignature supports the addition of formal template parameters in a specialization of a template classifier.<p>From package UML::Classification.</p>")

public interface Redefinabletemplatesignature extends GenericEntity, uml.Redefinableelement, uml.Templatesignature {

	EntityType<Redefinabletemplatesignature> T = EntityTypes.T(Redefinabletemplatesignature.class);

	/* Constants for each property name. */
	java.lang.String extendedSignature = "extendedSignature";
	java.lang.String inheritedParameter = "inheritedParameter";
	java.lang.String classifier = "classifier";

	@Description("The signatures extended by this RedefinableTemplateSignature.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Redefinabletemplatesignature> getExtendedSignature();
	void setExtendedSignature(java.util.List<uml.Redefinabletemplatesignature> extendedSignature);

	@Description("The formal template parameters of the extended signatures.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Templateparameter> getInheritedParameter();
	void setInheritedParameter(java.util.List<uml.Templateparameter> inheritedParameter);

	@Description("The Classifier that owns this RedefinableTemplateSignature.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Classifier getClassifier();
	void setClassifier(uml.Classifier classifier);
}
