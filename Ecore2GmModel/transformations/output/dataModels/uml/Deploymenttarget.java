/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Deploymenttarget of the Data Model uml.
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
{@link deployedElement}, 
{@link deployment}, 

* It provides of then following operations (getters and setters)
{@link getDeployedElement},
{@link getDeployment},
{@link setDeployedElement},
{@link setDeployment},
 */

@Description("A deployment target is the location for a deployed artifact.<p>From package UML::Deployments.</p>")
 
@Abstract 

public interface Deploymenttarget extends GenericEntity, uml.Namedelement {

	EntityType<Deploymenttarget> T = EntityTypes.T(Deploymenttarget.class);

	/* Constants for each property name. */
	java.lang.String deployedElement = "deployedElement";
	java.lang.String deployment = "deployment";

	@Description("The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Packageableelement> getDeployedElement();
	void setDeployedElement(java.util.List<uml.Packageableelement> deployedElement);

	@Description("The set of Deployments for a DeploymentTarget.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Deployment> getDeployment();
	void setDeployment(java.util.List<uml.Deployment> deployment);

}
