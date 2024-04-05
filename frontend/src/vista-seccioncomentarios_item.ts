import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; flex-shrink: 0; justify-content: space-between; height: 100%; flex-direction: row;">
 <vaadin-vertical-layout style="width: 85%; flex-shrink: 1;">
  <vaadin-horizontal-layout theme="" style="flex-shrink: 0; width: 100%; justify-content: space-between;">
   <vaadin-vertical-layout style="width: 15%; height: 100%;" id="Layoutfotousuarioseccioncomentariositem">
    <img style="flex-shrink: 0; width: 100%; height: 100%;" src="https://img.freepik.com/foto-gratis/chico-guapo-seguro-posando-contra-pared-blanca_176420-32936.jpg?size=626&amp;ext=jpg&amp;ga=GA1.1.117944100.1710201600&amp;semt=sph" id="Fotousuarioseccioncomentariositem">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 80%; flex-shrink: 0; height: 100%; flex-grow: 0; justify-content: center; align-self: center;" id="Layoutnickusuarioseccioncomentariositem">
    <label style="width: 100%; font-size: 120%;" id="Labelnickusuarioseccioncomentariositem">Nick</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="" style="flex-shrink: 0; width: 100%; justify-content: space-between; flex-grow: 0;">
   <vaadin-vertical-layout style="flex-shrink: 0; height: 100%; justify-content: flex-start; flex-grow: 1; padding-right: var(--lumo-space-s);" id="Layoutvistamostrarcomentarioseccioncomentariositem"></vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 6%; flex-shrink: 0; align-self: flex-start;" id="Layoutborrarcomentarioseccioncomentariositem">
    <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF;" id="seccioncomentariositem">
     <img style="width: 100%; height: 100%;" src="https://cdn-icons-png.flaticon.com/128/54/54324.png" id="Imagenborrarcomentarioseccioncomentariositem">
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 15%; flex-shrink: 0; height: 100%;" id="Layoutvistamostrarvaloracioncomentarioseccioncomentariositem"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
