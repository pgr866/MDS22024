import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-seccioncomentarios_item')
export class VistaSeccioncomentarios_item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-shrink: 0; justify-content: space-between;">
 <vaadin-horizontal-layout theme="" style="flex-shrink: 0; width: 100%; height: 45%; justify-content: space-between;">
  <vaadin-vertical-layout style="width: 20%; height: 100%;">
   <img style="flex-shrink: 0; width: 100%; height: 100%;" src="https://img.freepik.com/foto-gratis/chico-guapo-seguro-posando-contra-pared-blanca_176420-32936.jpg?size=626&amp;ext=jpg&amp;ga=GA1.1.117944100.1710201600&amp;semt=sph">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 60%; flex-shrink: 0; height: 100%; justify-content: center;">
   <vaadin-text-field style="width: 100%; height: 40%; flex-shrink: 0;" readonly value="Nick"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 10%; flex-shrink: 0; height: 100%; flex-direction: row; justify-content: space-between;">
   <vaadin-vertical-layout style="width: 40%; flex-shrink: 0; height: 100%;">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;">
     <img style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/512/126/126473.png">
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 40%; flex-shrink: 0; height: 100%; justify-content: center;">
    <vaadin-text-field style="width: 100%; height: 40%; flex-shrink: 0;" readonly value="N" has-value></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="" style="flex-shrink: 0; width: 100%; height: 45%; justify-content: space-between;">
  <vaadin-vertical-layout style="width: 70%; flex-shrink: 0; height: 100%;">
   <vaadin-text-field style="width: 100%; height: 40%; flex-shrink: 0;" readonly value="Contenido" has-value></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 10%; flex-shrink: 0; height: 100%; align-self: flex-start;">
   <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;">
    <img style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/128/54/54324.png">
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 10%; flex-shrink: 0; height: 100%; flex-direction: row; justify-content: space-between; align-self: flex-start;">
   <vaadin-vertical-layout style="width: 40%; flex-shrink: 0; height: 100%;">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;">
     <img style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/512/126/126504.png">
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 40%; flex-shrink: 0; height: 100%; justify-content: center;">
    <vaadin-text-field style="width: 100%; height: 40%; flex-shrink: 0;" readonly value="N" has-value></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
