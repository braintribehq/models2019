/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TestScript of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link identifier}, 
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link origin}, 
{@link destination}, 
{@link metadata}, 
{@link fixture}, 
{@link profile}, 
{@link variable}, 
{@link setup}, 
{@link test}, 
{@link teardown}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getOrigin},
{@link getDestination},
{@link getMetadata},
{@link getFixture},
{@link getProfile},
{@link getVariable},
{@link getSetup},
{@link getTest},
{@link getTeardown},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setOrigin},
{@link setDestination},
{@link setMetadata},
{@link setFixture},
{@link setProfile},
{@link setVariable},
{@link setSetup},
{@link setTest},
{@link setTeardown},
 */

@Description("A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.If the element is present, it must have either a @value, an @id, or extensions")

public interface TestScript extends GenericEntity, fhir.FhirDomainResource {

	EntityType<TestScript> T = EntityTypes.T(TestScript.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String origin = "origin";
	java.lang.String destination = "destination";
	java.lang.String metadata = "metadata";
	java.lang.String fixture = "fixture";
	java.lang.String profile = "profile";
	java.lang.String variable = "variable";
	java.lang.String setup = "setup";
	java.lang.String test = "test";
	java.lang.String teardown = "teardown";

	@Description("A formal identifier that is used to identify this test script when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate test script instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the test script is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("An abstract server used in operations within this test script in the origin element.")
	
	java.util.List<fhir.TestScriptOrigin> getOrigin();
	void setOrigin(java.util.List<fhir.TestScriptOrigin> origin);

	@Description("An abstract server used in operations within this test script in the destination element.")
	
	java.util.List<fhir.TestScriptDestination> getDestination();
	void setDestination(java.util.List<fhir.TestScriptDestination> destination);

	@Description("The required capability must exist and are assumed to function correctly on the FHIR server being tested.")
	@Mandatory
	fhir.TestScriptMetadata getMetadata();
	void setMetadata(fhir.TestScriptMetadata metadata);
	@Description("Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.")
	
	java.util.List<fhir.TestScriptFixture> getFixture();
	void setFixture(java.util.List<fhir.TestScriptFixture> fixture);

	@Description("Reference to the profile to be used for validation.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getProfile();
	void setProfile(java.util.List<com.braintribe.model.generic.GenericEntity> profile);

	@Description("Variable is set based either on element value in response body or on header field value in the response headers.")
	
	java.util.List<fhir.TestScriptVariable> getVariable();
	void setVariable(java.util.List<fhir.TestScriptVariable> variable);

	@Description("A series of required setup operations before tests are executed.")
	@Mandatory
	fhir.TestScriptSetup getSetup();
	void setSetup(fhir.TestScriptSetup setup);
	@Description("A test in this script.")
	
	java.util.List<fhir.TestScriptTest> getTest();
	void setTest(java.util.List<fhir.TestScriptTest> test);

	@Description("A series of operations required to clean up after all the tests are executed (successfully or otherwise).")
	@Mandatory
	fhir.TestScriptTeardown getTeardown();
	void setTeardown(fhir.TestScriptTeardown teardown);
}
