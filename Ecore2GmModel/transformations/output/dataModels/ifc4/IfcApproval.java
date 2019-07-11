/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcApproval of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link Identifier}, 
{@link Name}, 
{@link Description}, 
{@link TimeOfApproval}, 
{@link Status}, 
{@link Level}, 
{@link Qualifier}, 
{@link RequestingApproval}, 
{@link GivingApproval}, 
{@link HasExternalReferences}, 
{@link ApprovedObjects}, 
{@link ApprovedResources}, 
{@link IsRelatedWith}, 
{@link Relates}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getName},
{@link getDescription},
{@link getTimeOfApproval},
{@link getStatus},
{@link getLevel},
{@link getQualifier},
{@link getRequestingApproval},
{@link getGivingApproval},
{@link getHasExternalReferences},
{@link getApprovedObjects},
{@link getApprovedResources},
{@link getIsRelatedWith},
{@link getRelates},
{@link setIdentifier},
{@link setName},
{@link setDescription},
{@link setTimeOfApproval},
{@link setStatus},
{@link setLevel},
{@link setQualifier},
{@link setRequestingApproval},
{@link setGivingApproval},
{@link setHasExternalReferences},
{@link setApprovedObjects},
{@link setApprovedResources},
{@link setIsRelatedWith},
{@link setRelates},
 */

@Description("")

public interface IfcApproval extends GenericEntity, ifc4.IfcResourceObjectSelect {

	EntityType<IfcApproval> T = EntityTypes.T(IfcApproval.class);

	/* Constants for each property name. */
	java.lang.String Identifier = "Identifier";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String TimeOfApproval = "TimeOfApproval";
	java.lang.String Status = "Status";
	java.lang.String Level = "Level";
	java.lang.String Qualifier = "Qualifier";
	java.lang.String RequestingApproval = "RequestingApproval";
	java.lang.String GivingApproval = "GivingApproval";
	java.lang.String HasExternalReferences = "HasExternalReferences";
	java.lang.String ApprovedObjects = "ApprovedObjects";
	java.lang.String ApprovedResources = "ApprovedResources";
	java.lang.String IsRelatedWith = "IsRelatedWith";
	java.lang.String Relates = "Relates";

	@Description("")
	@Mandatory
	java.lang.String getIdentifier();
	void setIdentifier(java.lang.String Identifier);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getTimeOfApproval();
	void setTimeOfApproval(java.lang.String TimeOfApproval);
	@Description("")
	@Mandatory
	java.lang.String getStatus();
	void setStatus(java.lang.String Status);
	@Description("")
	@Mandatory
	java.lang.String getLevel();
	void setLevel(java.lang.String Level);
	@Description("")
	@Mandatory
	java.lang.String getQualifier();
	void setQualifier(java.lang.String Qualifier);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getRequestingApproval();
	void setRequestingApproval(ifc4.IfcActorSelect RequestingApproval);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getGivingApproval();
	void setGivingApproval(ifc4.IfcActorSelect GivingApproval);
	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReferences();
	void setHasExternalReferences(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReferences);

	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesApproval> getApprovedObjects();
	void setApprovedObjects(java.util.List<ifc4.IfcRelAssociatesApproval> ApprovedObjects);

	@Description("")
	
	java.util.List<ifc4.IfcResourceApprovalRelationship> getApprovedResources();
	void setApprovedResources(java.util.List<ifc4.IfcResourceApprovalRelationship> ApprovedResources);

	@Description("")
	
	java.util.List<ifc4.IfcApprovalRelationship> getIsRelatedWith();
	void setIsRelatedWith(java.util.List<ifc4.IfcApprovalRelationship> IsRelatedWith);

	@Description("")
	
	java.util.List<ifc4.IfcApprovalRelationship> getRelates();
	void setRelates(java.util.List<ifc4.IfcApprovalRelationship> Relates);

}
