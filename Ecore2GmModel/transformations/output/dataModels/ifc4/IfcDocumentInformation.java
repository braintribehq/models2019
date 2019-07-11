/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDocumentInformation of the Data Model iai.
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
{@link Identification}, 
{@link Name}, 
{@link Description}, 
{@link Location}, 
{@link Purpose}, 
{@link IntendedUse}, 
{@link Scope}, 
{@link Revision}, 
{@link DocumentOwner}, 
{@link Editors}, 
{@link CreationTime}, 
{@link LastRevisionTime}, 
{@link ElectronicFormat}, 
{@link ValidFrom}, 
{@link ValidUntil}, 
{@link Confidentiality}, 
{@link Status}, 
{@link DocumentInfoForObjects}, 
{@link HasDocumentReferences}, 
{@link IsPointedTo}, 
{@link IsPointer}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getName},
{@link getDescription},
{@link getLocation},
{@link getPurpose},
{@link getIntendedUse},
{@link getScope},
{@link getRevision},
{@link getDocumentOwner},
{@link getEditors},
{@link getCreationTime},
{@link getLastRevisionTime},
{@link getElectronicFormat},
{@link getValidFrom},
{@link getValidUntil},
{@link getConfidentiality},
{@link getStatus},
{@link getDocumentInfoForObjects},
{@link getHasDocumentReferences},
{@link getIsPointedTo},
{@link getIsPointer},
{@link setIdentification},
{@link setName},
{@link setDescription},
{@link setLocation},
{@link setPurpose},
{@link setIntendedUse},
{@link setScope},
{@link setRevision},
{@link setDocumentOwner},
{@link setEditors},
{@link setCreationTime},
{@link setLastRevisionTime},
{@link setElectronicFormat},
{@link setValidFrom},
{@link setValidUntil},
{@link setConfidentiality},
{@link setStatus},
{@link setDocumentInfoForObjects},
{@link setHasDocumentReferences},
{@link setIsPointedTo},
{@link setIsPointer},
 */

@Description("")

public interface IfcDocumentInformation extends GenericEntity, ifc4.IfcExternalInformation, ifc4.IfcDocumentSelect {

	EntityType<IfcDocumentInformation> T = EntityTypes.T(IfcDocumentInformation.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Location = "Location";
	java.lang.String Purpose = "Purpose";
	java.lang.String IntendedUse = "IntendedUse";
	java.lang.String Scope = "Scope";
	java.lang.String Revision = "Revision";
	java.lang.String DocumentOwner = "DocumentOwner";
	java.lang.String Editors = "Editors";
	java.lang.String CreationTime = "CreationTime";
	java.lang.String LastRevisionTime = "LastRevisionTime";
	java.lang.String ElectronicFormat = "ElectronicFormat";
	java.lang.String ValidFrom = "ValidFrom";
	java.lang.String ValidUntil = "ValidUntil";
	java.lang.String Confidentiality = "Confidentiality";
	java.lang.String Status = "Status";
	java.lang.String DocumentInfoForObjects = "DocumentInfoForObjects";
	java.lang.String HasDocumentReferences = "HasDocumentReferences";
	java.lang.String IsPointedTo = "IsPointedTo";
	java.lang.String IsPointer = "IsPointer";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
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
	java.lang.String getLocation();
	void setLocation(java.lang.String Location);
	@Description("")
	@Mandatory
	java.lang.String getPurpose();
	void setPurpose(java.lang.String Purpose);
	@Description("")
	@Mandatory
	java.lang.String getIntendedUse();
	void setIntendedUse(java.lang.String IntendedUse);
	@Description("")
	@Mandatory
	java.lang.String getScope();
	void setScope(java.lang.String Scope);
	@Description("")
	@Mandatory
	java.lang.String getRevision();
	void setRevision(java.lang.String Revision);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getDocumentOwner();
	void setDocumentOwner(ifc4.IfcActorSelect DocumentOwner);
	@Description("")
	
	java.util.List<ifc4.IfcActorSelect> getEditors();
	void setEditors(java.util.List<ifc4.IfcActorSelect> Editors);

	@Description("")
	@Mandatory
	java.lang.String getCreationTime();
	void setCreationTime(java.lang.String CreationTime);
	@Description("")
	@Mandatory
	java.lang.String getLastRevisionTime();
	void setLastRevisionTime(java.lang.String LastRevisionTime);
	@Description("")
	@Mandatory
	java.lang.String getElectronicFormat();
	void setElectronicFormat(java.lang.String ElectronicFormat);
	@Description("")
	@Mandatory
	java.lang.String getValidFrom();
	void setValidFrom(java.lang.String ValidFrom);
	@Description("")
	@Mandatory
	java.lang.String getValidUntil();
	void setValidUntil(java.lang.String ValidUntil);
	@Description("")
	@Mandatory
	ifc4.IfcDocumentConfidentialityEnum getConfidentiality();
	void setConfidentiality(ifc4.IfcDocumentConfidentialityEnum Confidentiality);
	@Description("")
	@Mandatory
	ifc4.IfcDocumentStatusEnum getStatus();
	void setStatus(ifc4.IfcDocumentStatusEnum Status);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesDocument> getDocumentInfoForObjects();
	void setDocumentInfoForObjects(java.util.List<ifc4.IfcRelAssociatesDocument> DocumentInfoForObjects);

	@Description("")
	
	java.util.List<ifc4.IfcDocumentReference> getHasDocumentReferences();
	void setHasDocumentReferences(java.util.List<ifc4.IfcDocumentReference> HasDocumentReferences);

	@Description("")
	
	java.util.List<ifc4.IfcDocumentInformationRelationship> getIsPointedTo();
	void setIsPointedTo(java.util.List<ifc4.IfcDocumentInformationRelationship> IsPointedTo);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcDocumentInformationRelationship> getIsPointer();
	void setIsPointer(java.util.List<ifc4.IfcDocumentInformationRelationship> IsPointer);

}
