/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Deployment of the Data Model uml.
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
{@link configuration}, 
{@link deployedArtifact}, 
{@link location}, 

* It provides of then following operations (getters and setters)
{@link getConfiguration},
{@link getDeployedArtifact},
{@link getLocation},
{@link setConfiguration},
{@link setDeployedArtifact},
{@link setLocation},
 */

@Description("A deployment is the allocation of an artifact or artifact instance to a deployment target.A component deployment is the deployment of one or more artifacts or artifact instances to a deployment target, optionally parameterized by a deployment specification. Examples are executables and configuration files.<p>From package UML::Deployments.</p>")

public interface Deployment extends GenericEntity, uml.Dependency {

	EntityType<Deployment> T = EntityTypes.T(Deployment.class);

	/* Constants for each property name. */
	java.lang.String configuration = "configuration";
	java.lang.String deployedArtifact = "deployedArtifact";
	java.lang.String location = "location";

	@Description("The specification of properties that parameterize the deployment and execution of one or more Artifacts.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Deploymentspecification> getConfiguration();
	void setConfiguration(java.util.List<uml.Deploymentspecification> configuration);

	@Description("The Artifacts that are deployed onto a Node. This association specializes the supplier association.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Deployedartifact> getDeployedArtifact();
	void setDeployedArtifact(java.util.List<uml.Deployedartifact> deployedArtifact);

	@Description("The DeployedTarget which is the target of a Deployment.<p>From package UML::Deployments.</p>")
	@Mandatory
	uml.Deploymenttarget getLocation();
	void setLocation(uml.Deploymenttarget location);
}
