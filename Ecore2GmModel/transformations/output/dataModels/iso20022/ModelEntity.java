/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ModelEntity of the Data Model iso20022.
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
{@link nextVersions}, 
{@link previousVersion}, 
{@link objectIdentifier}, 

* It provides of then following operations (getters and setters)
{@link getNextVersions},
{@link getPreviousVersion},
{@link getObjectIdentifier},
{@link setNextVersions},
{@link setPreviousVersion},
{@link setObjectIdentifier},
 */

@Description("Abstract definition of a model entity.The common meta class which is the generalisation of all Meta Classes.")
 
@Abstract 

public interface ModelEntity extends GenericEntity {

	EntityType<ModelEntity> T = EntityTypes.T(ModelEntity.class);

	/* Constants for each property name. */
	java.lang.String nextVersions = "nextVersions";
	java.lang.String previousVersion = "previousVersion";
	java.lang.String objectIdentifier = "objectIdentifier";

	@Description("List of next versions of a ModelEntity that stem from this ModelEntity.Allows version control management.")
	
	java.util.List<iso20022.ModelEntity> getNextVersions();
	void setNextVersions(java.util.List<iso20022.ModelEntity> nextVersions);

	@Description("Previous version of a ModelEntity that this ModelEntity stems from.Allows version control management.")
	@Mandatory
	iso20022.ModelEntity getPreviousVersion();
	void setPreviousVersion(iso20022.ModelEntity previousVersion);
	@Description("Uniquely identifies the RepositoryConcept")
	@Mandatory
	java.lang.String getObjectIdentifier();
	void setObjectIdentifier(java.lang.String objectIdentifier);
}
