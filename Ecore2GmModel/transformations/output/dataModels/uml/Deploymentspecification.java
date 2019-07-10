/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Deploymentspecification of the Data Model uml.
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
{@link deploymentLocation}, 
{@link executionLocation}, 
{@link deployment}, 

* It provides of then following operations (getters and setters)
{@link getDeploymentLocation},
{@link getExecutionLocation},
{@link getDeployment},
{@link setDeploymentLocation},
{@link setExecutionLocation},
{@link setDeployment},
 */

@Description("A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor.<p>From package UML::Deployments.</p>")

public interface Deploymentspecification extends GenericEntity, uml.Artifact {

	EntityType<Deploymentspecification> T = EntityTypes.T(Deploymentspecification.class);

	/* Constants for each property name. */
	java.lang.String deploymentLocation = "deploymentLocation";
	java.lang.String executionLocation = "executionLocation";
	java.lang.String deployment = "deployment";

	@Description("The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address.'<p>From package UML::Deployments.</p>")
	@Mandatory
	types.String getDeploymentLocation();
	void setDeploymentLocation(types.String deploymentLocation);
	@Description("The location where a component Artifact executes. This may be a local or remote location.<p>From package UML::Deployments.</p>")
	@Mandatory
	types.String getExecutionLocation();
	void setExecutionLocation(types.String executionLocation);
	@Description("The deployment with which the DeploymentSpecification is associated.<p>From package UML::Deployments.</p>")
	@Mandatory
	uml.Deployment getDeployment();
	void setDeployment(uml.Deployment deployment);
}
