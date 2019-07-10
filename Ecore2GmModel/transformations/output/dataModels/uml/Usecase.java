/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Usecase of the Data Model uml.
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
{@link extend}, 
{@link extensionPoint}, 
{@link include}, 
{@link subject}, 

* It provides of then following operations (getters and setters)
{@link getExtend},
{@link getExtensionPoint},
{@link getInclude},
{@link getSubject},
{@link setExtend},
{@link setExtensionPoint},
{@link setInclude},
{@link setSubject},
 */

@Description("A UseCase specifies a set of actions performed by its subjects, which yields an observable result that is of value for one or more Actors or other stakeholders of each subject.<p>From package UML::UseCases.</p>")

public interface Usecase extends GenericEntity, uml.Behavioredclassifier {

	EntityType<Usecase> T = EntityTypes.T(Usecase.class);

	/* Constants for each property name. */
	java.lang.String extend = "extend";
	java.lang.String extensionPoint = "extensionPoint";
	java.lang.String include = "include";
	java.lang.String subject = "subject";

	@Description("The Extend relationships owned by this UseCase.<p>From package UML::UseCases.</p>")
	
	java.util.List<uml.Extend> getExtend();
	void setExtend(java.util.List<uml.Extend> extend);

	@Description("The ExtensionPoints owned by this UseCase.<p>From package UML::UseCases.</p>")
	
	java.util.List<uml.Extensionpoint> getExtensionPoint();
	void setExtensionPoint(java.util.List<uml.Extensionpoint> extensionPoint);

	@Description("The Include relationships owned by this UseCase.<p>From package UML::UseCases.</p>")
	
	java.util.List<uml.Include> getInclude();
	void setInclude(java.util.List<uml.Include> include);

	@Description("The subjects to which this UseCase applies. Each subject or its parts realize all the UseCases that apply to it.<p>From package UML::UseCases.</p>")
	
	java.util.List<uml.Classifier> getSubject();
	void setSubject(java.util.List<uml.Classifier> subject);

}
